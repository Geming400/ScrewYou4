package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Linear.class)
public class Linear1224695033Mixin {
        @Inject(at = @At("HEAD"), method = "base()F", cancellable = true)
    private void base_1262954396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262954396L))
            info.setReturnValue(9.870837E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1684760004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684760004L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_89235058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89235058L))
            info.setReturnValue("i +pw^,\u5F21O'/e3y\u9690k^\u5CF6CFz9/y1^9/Dl ?Js");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1262957775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262957775L))
            info.setReturnValue(1508341362);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1334418539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334418539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__1856370667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856370667L))
            info.setReturnValue(9.870837E8F);
    }

    @Inject(at = @At("HEAD"), method = "perLevelAboveFirst()F", cancellable = true)
    private void perLevelAboveFirst_1262954396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262954396L))
            info.setReturnValue(9.870837E8F);
    }


}
