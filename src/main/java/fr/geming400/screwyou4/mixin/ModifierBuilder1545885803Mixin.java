package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetAttributesFunction.ModifierBuilder.class)
public class ModifierBuilder1545885803Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/SetAttributesFunction$Modifier;", cancellable = true)
    private void build_642862572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(642862572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forSlot(Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/level/storage/loot/functions/SetAttributesFunction$ModifierBuilder;", cancellable = true)
    private void forSlot_1916093731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916093731L))
            info.setReturnValue(null);
    }


}
