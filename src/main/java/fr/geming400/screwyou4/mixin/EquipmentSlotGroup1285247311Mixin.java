package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EquipmentSlotGroup.class)
public class EquipmentSlotGroup1285247311Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EquipmentSlotGroup;", cancellable = true)
    private static void values__837569210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837569210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void test_1971911218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971911218L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EquipmentSlotGroup;", cancellable = true)
    private static void valueOf_1507878623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507878623L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlotGroup.CHEST);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1375641187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1375641187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Ljava/util/List;", cancellable = true)
    private void slots_683043124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683043124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1373455933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373455933L))
            info.setReturnValue("h6|[+ `/AGq|\uB2A4HtTVYqvB}9Ps\u9C21x6)\uB135p,.\u28E4C<S\u3A55+x$'x2:B\"DW7");
    }

    @Inject(at = @At("HEAD"), method = "bySlot(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/entity/EquipmentSlotGroup;", cancellable = true)
    private static void bySlot__1110027994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110027994L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlotGroup.SADDLE);
    }


}
