package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder.class)
public class Builder1191688577Mixin {
        @Inject(at = @At("HEAD"), method = "head(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void head_1570519272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570519272L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate;", cancellable = true)
    private void build__1979448904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979448904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "body(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void body_1570519272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570519272L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "chest(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void chest_1570519272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570519272L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "equipment()Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private static void equipment__427554183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427554183L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "mainhand(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void mainhand_1570519272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570519272L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "offhand(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void offhand_1570519272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570519272L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "legs(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void legs_1570519272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570519272L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "feet(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;", cancellable = true)
    private void feet_1570519272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570519272L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.Builder());
    }


}
