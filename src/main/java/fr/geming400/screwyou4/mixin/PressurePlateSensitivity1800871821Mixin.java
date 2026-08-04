package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BlockSetType.PressurePlateSensitivity.class)
public class PressurePlateSensitivity1800871821Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BlockSetType$PressurePlateSensitivity;", cancellable = true)
    private static void values__809605015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809605015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BlockSetType$PressurePlateSensitivity;", cancellable = true)
    private static void valueOf_1153071078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153071078L))
            info.setReturnValue(null);
    }


}
