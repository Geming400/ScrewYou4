package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.ExtendedView.class)
public class ExtendedView_1538054492Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_1669177067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669177067L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_142803837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142803837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_629428223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629428223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1986489280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986489280L))
            info.setReturnValue("Gw3IKzy\u4178\u686FV;lKbX}kr6\u2946WFUF>:0t8Pv\uB559#| Lk_^,o\u00E0-9g_S]l");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2095406582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095406582L))
            info.setReturnValue(-1563452034);
    }


}
