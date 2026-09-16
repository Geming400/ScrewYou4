package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder.class)
public class Builder1191688577Mixin {
        @Inject(at = @At("HEAD"), method = "head(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void head_41371336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(41371336L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate;", cancellable = true)
    private void build_815135370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815135370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "body(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void body__1640313206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640313206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipment()Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private static void equipment_1712217643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712217643L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "chest(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void chest_933948905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933948905L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "offhand(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void offhand_1806433094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806433094L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "mainhand(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void mainhand__1556501872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1556501872L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "feet(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void feet__49405290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-49405290L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "legs(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void legs_1179950861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179950861L))
            info.setReturnValue(null);
    }


}
