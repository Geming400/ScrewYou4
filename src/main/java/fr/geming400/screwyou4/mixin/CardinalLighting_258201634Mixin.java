package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.CardinalLighting.class)
public class CardinalLighting_258201634Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__650424635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650424635L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1028625158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028625158L))
            info.setReturnValue("@sl}\"${F1\uD040\uCA5E\u47DAfp6%lf\u1D90\u9C2Au\u2BDE9\uBA69]\u1655d \uA0CCOf[Y\u03C9#?)4Sopl4YOEMR?o2ZP\u8C34jT2pPJ .4GgnaACY\"Et\"$nry%\u6283=o%i\u921C=={\u6A44 ] ]?\uAA8ER");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_815553724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815553724L))
            info.setReturnValue(-1768819301);
    }

    @Inject(at = @At("HEAD"), method = "up()F", cancellable = true)
    private void up__33325815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33325815L))
            info.setReturnValue(1.310518E8F);
    }

    @Inject(at = @At("HEAD"), method = "down()F", cancellable = true)
    private void down_1506022242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506022242L))
            info.setReturnValue(1.310518E8F);
    }

    @Inject(at = @At("HEAD"), method = "east()F", cancellable = true)
    private void east_1985754343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985754343L))
            info.setReturnValue(1.310518E8F);
    }

    @Inject(at = @At("HEAD"), method = "west()F", cancellable = true)
    private void west__2102348171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102348171L))
            info.setReturnValue(1.310518E8F);
    }

    @Inject(at = @At("HEAD"), method = "north()F", cancellable = true)
    private void north_1056388319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056388319L))
            info.setReturnValue(1.310518E8F);
    }

    @Inject(at = @At("HEAD"), method = "south()F", cancellable = true)
    private void south_1007284503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007284503L))
            info.setReturnValue(1.310518E8F);
    }

    @Inject(at = @At("HEAD"), method = "byFace(Lnet/minecraft/core/Direction;)F", cancellable = true)
    private void byFace_478359804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478359804L))
            info.setReturnValue(1.310518E8F);
    }


}
