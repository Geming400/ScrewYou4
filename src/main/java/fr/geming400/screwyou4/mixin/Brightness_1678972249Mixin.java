package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Brightness.class)
public class Brightness_1678972249Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_770345980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770345980L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1845571523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845571523L))
            info.setReturnValue("/G\uF9A7SBvT\uFEEDb`+\u9D36UY=yg=\u1DB3lK\u7FB4>J.{=QZ]\uCD57#E(ZIB't\u10C3!%]!]-U\u5312Gs;/s\u74E7!,kl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2058642957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2058642957L))
            info.setReturnValue(811314089);
    }

    @Inject(at = @At("HEAD"), method = "block()I", cancellable = true)
    private void block__1382484271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382484271L))
            info.setReturnValue(1909154764);
    }

    @Inject(at = @At("HEAD"), method = "pack()I", cancellable = true)
    private void pack__868421435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868421435L))
            info.setReturnValue(-295499556);
    }

    @Inject(at = @At("HEAD"), method = "unpack(I)Lnet/minecraft/util/Brightness;", cancellable = true)
    private static void unpack_457403157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457403157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sky()I", cancellable = true)
    private void sky__80266563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-80266563L))
            info.setReturnValue(-1560209977);
    }


}
