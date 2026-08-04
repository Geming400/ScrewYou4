package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.DropChances.class)
public class DropChances2050426130Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__859028907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859028907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_914966155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914966155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2088688872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088688872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPreserved(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void isPreserved__1249173305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249173305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byEquipment()Ljava/util/Map;", cancellable = true)
    private void byEquipment_45802490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45802490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byEquipment(Lnet/minecraft/world/entity/EquipmentSlot;)F", cancellable = true)
    private void byEquipment__1249192525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249192525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEquipmentChance(Lnet/minecraft/world/entity/EquipmentSlot;F)Lnet/minecraft/world/entity/DropChances;", cancellable = true)
    private void withEquipmentChance_814391859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814391859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withGuaranteedDrop(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/entity/DropChances;", cancellable = true)
    private void withGuaranteedDrop_1103596845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103596845L))
            info.setReturnValue(null);
    }


}
