package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BlocksAttacks.DamageReduction.class)
public class DamageReduction1674083055Mixin {
        @Inject(at = @At("HEAD"), method = "base()F", cancellable = true)
    private void base__195372703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195372703L))
            info.setReturnValue(1.901676E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Ljava/util/Optional;", cancellable = true)
    private void type__1634406953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634406953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_765456787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765456787L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1850460716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850460716L))
            info.setReturnValue("g=bCJ-ysy2iOQ5Kd/-Q/]LnFJ=pxp9\uB6DBO7i\u8878\uC3A9& e)\u8F05OZ?*]#a\uCD0C\u4251w");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2063532150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063532150L))
            info.setReturnValue(-182046736);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/world/damagesource/DamageSource;FD)F", cancellable = true)
    private void resolve_410756565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410756565L))
            info.setReturnValue(1.911681E8F);
    }

    @Inject(at = @At("HEAD"), method = "factor()F", cancellable = true)
    private void factor_1675543971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675543971L))
            info.setReturnValue(1.911681E8F);
    }

    @Inject(at = @At("HEAD"), method = "horizontalBlockingAngle()F", cancellable = true)
    private void horizontalBlockingAngle__1455773192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455773192L))
            info.setReturnValue(1.911681E8F);
    }


}
