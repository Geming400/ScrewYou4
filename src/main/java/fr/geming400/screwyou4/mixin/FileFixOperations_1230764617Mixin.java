package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.FileFixOperations.class)
public class FileFixOperations_1230764617Mixin {
        @Inject(at = @At("HEAD"), method = "delete(Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/DeleteFileOrEmptyDirectory;", cancellable = true)
    private static void delete__1221184794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221184794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/Move;", cancellable = true)
    private static void move__164634251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164634251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "groupMove(Ljava/util/Map;Ljava/util/List;)Lnet/minecraft/util/filefix/operations/GroupMove;", cancellable = true)
    private static void groupMove_699065108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699065108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveRegex(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/RegexMove;", cancellable = true)
    private static void moveRegex_663299060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663299060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveSimple(Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/Move;", cancellable = true)
    private static void moveSimple_952213823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(952213823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyInFolders(Lnet/minecraft/util/filefix/access/FileRelation;Ljava/util/List;)Lnet/minecraft/util/filefix/operations/ApplyInFolders;", cancellable = true)
    private static void applyInFolders__996912996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-996912996L))
            info.setReturnValue(null);
    }


}
