package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.NativeModuleLister.NativeModuleInfo.class)
public class NativeModuleInfo_737053615Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__398406857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398406857L))
            info.setReturnValue(")CjZa`>Z❉.:aDN)U*BRIQ/nf笈J>6lAVxVS\"5ύO|H簉 Fe็g|Kp焥3tl_nqtN Kpf4vthVeP鱝轰`9㚒9쳅隳Lgz(o슙Uf] _n");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2122565873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122565873L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__398406857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398406857L))
            info.setReturnValue(")CjZa`>Z❉.:aDN)U*BRIQ/nf笈J>6lAVxVS\"5ύO|H簉 Fe็g|Kp焥3tl_nqtN Kpf4vthVeP鱝轰`9㚒9쳅隳Lgz(o슙Uf] _n");
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/util/Optional;", cancellable = true)
    private void version_982515036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982515036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_775316356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775316356L))
            info.setReturnValue(-1189853390);
    }


}
