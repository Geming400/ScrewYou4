package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.structures.NbtToSnbt.class)
public class NbtToSnbt1531013882Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__357833020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357833020L))
            info.setReturnValue("6+7\u17A1:\u791FT#.:}s$Ui9<%o.fsYCcaH=Wo26`0L\u550E-R+Q`\u5A06Z!|E@b\uAC164/");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1630739625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630739625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertStructure(Lnet/minecraft/data/CachedOutput;Ljava/nio/file/Path;Ljava/lang/String;Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private static void convertStructure__313223227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-313223227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeSnbt(Lnet/minecraft/data/CachedOutput;Ljava/nio/file/Path;Ljava/lang/String;)V", cancellable = true)
    private static void writeSnbt__783232291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-783232291L))
            info.cancel();
    }


}
