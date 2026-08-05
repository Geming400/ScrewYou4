package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.DataFixers.class)
public class DataFixers_314987641Mixin {
        @Inject(at = @At("HEAD"), method = "optimize(Ljava/util/Set;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void optimize_1043090683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043090683L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getDataFixer()Lcom/mojang/datafixers/DataFixer;", cancellable = true)
    private static void getDataFixer__1736794497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736794497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileFixer()Lnet/minecraft/util/filefix/FileFixerUpper;", cancellable = true)
    private static void getFileFixer_1621806777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621806777L))
            info.setReturnValue(null);
    }


}
