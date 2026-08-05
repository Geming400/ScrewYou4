package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.ArmorType.class)
public class ArmorType_812703525Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__322756947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322756947L))
            info.setReturnValue("NeM<z\u3E33/\uAD8ENOsy NU\uA52DQ@@\u3D90BDzG\u5C88Z*W;G\u09B7mw&\u0632\uBFD5FQHo]t\u9B0BU8v\u1B7D\u641BP[z3f%C?dd");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/equipment/ArmorType;", cancellable = true)
    private static void values__430331082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430331082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/equipment/ArmorType;", cancellable = true)
    private static void valueOf__1878739213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878739213L))
            info.setReturnValue(net.minecraft.world.item.equipment.ArmorType.HELMET);
    }

    @Inject(at = @At("HEAD"), method = "getSlot()Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void getSlot_628243105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628243105L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.LEGS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__322756947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322756947L))
            info.setReturnValue("NeM<z\u3E33/\uAD8ENOsy NU\uA52DQ@@\u3D90BDzG\u5C88Z*W;G\u09B7mw&\u0632\uBFD5FQHo]t\u9B0BU8v\u1B7D\u641BP[z3f%C?dd");
    }

    @Inject(at = @At("HEAD"), method = "getDurability(I)I", cancellable = true)
    private void getDurability_2026608003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026608003L))
            info.setReturnValue(-422154240);
    }


}
