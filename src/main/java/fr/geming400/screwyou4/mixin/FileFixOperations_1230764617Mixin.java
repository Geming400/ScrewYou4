package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.FileFixOperations.class)
public class FileFixOperations_1230764617Mixin {
        @Inject(at = @At("HEAD"), method = "delete(Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/DeleteFileOrEmptyDirectory;", cancellable = true)
    private static void delete__1759096943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759096943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/Move;", cancellable = true)
    private static void move_1814364870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814364870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyInFolders(Lnet/minecraft/util/filefix/access/FileRelation;Ljava/util/List;)Lnet/minecraft/util/filefix/operations/ApplyInFolders;", cancellable = true)
    private static void applyInFolders_1472878382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472878382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "groupMove(Ljava/util/Map;Ljava/util/List;)Lnet/minecraft/util/filefix/operations/GroupMove;", cancellable = true)
    private static void groupMove__867771900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867771900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveRegex(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/RegexMove;", cancellable = true)
    private static void moveRegex_1057224126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057224126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveSimple(Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/Move;", cancellable = true)
    private static void moveSimple_1694684514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694684514L))
            info.setReturnValue(null);
    }


}
