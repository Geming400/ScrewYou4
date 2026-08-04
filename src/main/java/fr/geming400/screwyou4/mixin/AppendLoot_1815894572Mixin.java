package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.rule.blockentity.AppendLoot.class)
public class AppendLoot_1815894572Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/util/RandomSource;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void apply_1386359054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386359054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/templatesystem/rule/blockentity/RuleBlockEntityModifierType;", cancellable = true)
    private void getType_451042563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451042563L))
            info.setReturnValue(null);
    }


}
