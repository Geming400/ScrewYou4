package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.BlockBehaviour.OffsetType.class)
public class OffsetType1809420075Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/BlockBehaviour$OffsetType;", cancellable = true)
    private static void values_992764523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992764523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/BlockBehaviour$OffsetType;", cancellable = true)
    private static void valueOf__1536999484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536999484L))
            info.setReturnValue(net.minecraft.world.level.block.state.BlockBehaviour.OffsetType.NONE);
    }


}
