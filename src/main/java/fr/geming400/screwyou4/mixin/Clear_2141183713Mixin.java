package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.rule.blockentity.Clear.class)
public class Clear_2141183713Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/util/RandomSource;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void apply_1711648195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711648195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/templatesystem/rule/blockentity/RuleBlockEntityModifierType;", cancellable = true)
    private void getType_776331704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776331704L))
            info.setReturnValue(null);
    }


}
