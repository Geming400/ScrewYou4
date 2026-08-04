package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.BlockBehaviour.OffsetType.class)
public class OffsetType1809420075Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/BlockBehaviour$OffsetType;", cancellable = true)
    private static void values__1689602359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689602359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/BlockBehaviour$OffsetType;", cancellable = true)
    private static void valueOf_2054229996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054229996L))
            info.setReturnValue(null);
    }


}
