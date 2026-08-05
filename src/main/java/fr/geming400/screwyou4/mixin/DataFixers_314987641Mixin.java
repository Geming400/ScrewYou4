package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.DataFixers.class)
public class DataFixers_314987641Mixin {
        @Inject(at = @At("HEAD"), method = "optimize(Ljava/util/Set;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void optimize__1297461768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297461768L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getFileFixer()Lnet/minecraft/util/filefix/FileFixerUpper;", cancellable = true)
    private static void getFileFixer__262208151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262208151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDataFixer()Lcom/mojang/datafixers/DataFixer;", cancellable = true)
    private static void getDataFixer__2035675007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035675007L))
            info.setReturnValue(null);
    }


}
