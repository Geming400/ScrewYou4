package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetAttributesFunction.ModifierBuilder.class)
public class ModifierBuilder1545885803Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/SetAttributesFunction$Modifier;", cancellable = true)
    private void build_272282522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272282522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forSlot(Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/level/storage/loot/functions/SetAttributesFunction$ModifierBuilder;", cancellable = true)
    private void forSlot__861771286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861771286L))
            info.setReturnValue(null);
    }


}
