package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.BundleHasSelectedItem.class)
public class BundleHasSelectedItem94886792Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_226009368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226009368L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1300363862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300363862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__813739476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813739476L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_865310317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865310317L))
            info.setReturnValue("\u29E8#Ub;c5XoI-ESrQ5tOt^JiFw\uFB79?yj8u\"J&ZLl\u6DCA\u50E85(\u575C3E^`zmTRiW\u157Bv<04tnjfB\uB338-Q4nA_\u4FB0I1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_652238883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652238883L))
            info.setReturnValue(-1613151481);
    }


}
