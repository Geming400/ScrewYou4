package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EquipmentSlotGroup.class)
public class EquipmentSlotGroup1285247311Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EquipmentSlotGroup;", cancellable = true)
    private static void values_1996948772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996948772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void test__2014352124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2014352124L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EquipmentSlotGroup;", cancellable = true)
    private static void valueOf_45969671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45969671L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlotGroup.MAINHAND);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__866368721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866368721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Ljava/util/List;", cancellable = true)
    private void slots__1383383169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383383169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_149786840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149786840L))
            info.setReturnValue("!suE])GW_b;T`FIPsl.UE%Ⲑ *^2Ⳡ{9Mh7'uGcQ裆pg2喚b夝dNT兰%=⥝|XI洍Tf5+?Ta:紓y%㎞J0_O");
    }

    @Inject(at = @At("HEAD"), method = "bySlot(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/entity/EquipmentSlotGroup;", cancellable = true)
    private static void bySlot_209620987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209620987L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlotGroup.OFFHAND);
    }


}
