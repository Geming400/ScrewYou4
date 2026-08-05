package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BlockSetType.PressurePlateSensitivity.class)
public class PressurePlateSensitivity1800871821Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BlockSetType$PressurePlateSensitivity;", cancellable = true)
    private static void values_1713948295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713948295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BlockSetType$PressurePlateSensitivity;", cancellable = true)
    private static void valueOf__183241458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183241458L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.BlockSetType.PressurePlateSensitivity.MOBS);
    }


}
