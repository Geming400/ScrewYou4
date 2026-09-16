package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.Equippable.class)
public class Equippable_989315626Mixin {
        @Inject(at = @At("HEAD"), method = "slot()Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void slot__680445148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680445148L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.HEAD);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_80689357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80689357L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1759739150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759739150L))
            info.setReturnValue("2'#\u3443;029Uh#5\"'BV[P5\u310EEfe+-]:|q+P9o=d=ZY/^w=@W<|H\u9B7Bw?]2l\u0C83rwx.1t*T'\"AD}!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1546667716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546667716L))
            info.setReturnValue(955972152);
    }

    @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private static void builder_1820037259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820037259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageOnHurt()Z", cancellable = true)
    private void damageOnHurt_2061904675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061904675L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "dispensable()Z", cancellable = true)
    private void dispensable__1256057922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256057922L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeEquippedBy(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void canBeEquippedBy_938112984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938112984L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "swapWithEquipmentSlot(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void swapWithEquipmentSlot__289627076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289627076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void equipSound_1711051654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711051654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Ljava/util/Optional;", cancellable = true)
    private void assetId_927734530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927734530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeSheared()Z", cancellable = true)
    private void canBeSheared_780525171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780525171L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shearingSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void shearingSound__235197897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235197897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowedEntities()Ljava/util/Optional;", cancellable = true)
    private void allowedEntities__150475168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150475168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cameraOverlay()Ljava/util/Optional;", cancellable = true)
    private void cameraOverlay_621254722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621254722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saddle()Lnet/minecraft/world/item/equipment/Equippable;", cancellable = true)
    private static void saddle__1033001384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033001384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "harness(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/item/equipment/Equippable;", cancellable = true)
    private static void harness__1620923192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620923192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "llamaSwag(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/item/equipment/Equippable;", cancellable = true)
    private static void llamaSwag_718274167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718274167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swappable()Z", cancellable = true)
    private void swappable_1894022697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894022697L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "equipOnTarget(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void equipOnTarget_822383113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822383113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipOnInteract()Z", cancellable = true)
    private void equipOnInteract__1802665605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802665605L))
            info.setReturnValue(true);
    }


}
