package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.ArmorType.class)
public class ArmorType_812703525Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1076143378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076143378L))
            info.setReturnValue("&3:i\u28B5&\uA1BD{lSmzAc_#%cF=hd");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/equipment/ArmorType;", cancellable = true)
    private static void values_1556442836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556442836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/equipment/ArmorType;", cancellable = true)
    private static void valueOf_1077913115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077913115L))
            info.setReturnValue(net.minecraft.world.item.equipment.ArmorType.BOOTS);
    }

    @Inject(at = @At("HEAD"), method = "getSlot()Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void getSlot_466706965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466706965L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.SADDLE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_900912146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900912146L))
            info.setReturnValue("%2\u5149GJj;,QvW\u6764^Z\u2CDF;AU");
    }

    @Inject(at = @At("HEAD"), method = "getDurability(I)I", cancellable = true)
    private void getDurability_956673602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956673602L))
            info.setReturnValue(-23338183);
    }


}
