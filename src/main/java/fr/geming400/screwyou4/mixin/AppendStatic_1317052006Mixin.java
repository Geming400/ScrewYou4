package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.rule.blockentity.AppendStatic.class)
public class AppendStatic_1317052006Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/util/RandomSource;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void apply__697912550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697912550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/templatesystem/rule/blockentity/RuleBlockEntityModifierType;", cancellable = true)
    private void getType__1462164243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462164243L))
            info.setReturnValue(null);
    }


}
