package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.DropChances.class)
public class DropChances2050426130Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1141799862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141799862L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1474117641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1474117641L))
            info.setReturnValue("ZrRoyuYmEWP]0F*l\u6E82\uFB1FPQ'hA;uH&@!vvy[f:dh&o^chFH>[\u32F7g|?I,xK\u3B71\uC850e_RYWYi<V3\"nDm({U^rbMr>4Kv\u9D71L<\uAF83tG7+)<#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1687189075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687189075L))
            info.setReturnValue(849380497);
    }

    @Inject(at = @At("HEAD"), method = "isPreserved(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void isPreserved__569119367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569119367L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "byEquipment()Ljava/util/Map;", cancellable = true)
    private void byEquipment_1517784995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1517784995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byEquipment(Lnet/minecraft/world/entity/EquipmentSlot;)F", cancellable = true)
    private void byEquipment__22619684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22619684L))
            info.setReturnValue(4.661781E8F);
    }

    @Inject(at = @At("HEAD"), method = "withGuaranteedDrop(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/entity/DropChances;", cancellable = true)
    private void withGuaranteedDrop__474803010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-474803010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEquipmentChance(Lnet/minecraft/world/entity/EquipmentSlot;F)Lnet/minecraft/world/entity/DropChances;", cancellable = true)
    private void withEquipmentChance_814172663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814172663L))
            info.setReturnValue(null);
    }


}
