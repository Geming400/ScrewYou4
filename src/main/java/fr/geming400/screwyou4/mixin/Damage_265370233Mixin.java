package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.Damage.class)
public class Damage_265370233Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__745672854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745672854L))
            info.setReturnValue(4.033427E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_2001223956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001223956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1650882491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650882491L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__870089743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870089743L))
            info.setReturnValue("d\u7264{4r:.0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_303632974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303632974L))
            info.setReturnValue(1372204480);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Z", cancellable = true)
    private void normalize_303648815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303648815L))
            info.setReturnValue(true);
    }


}
