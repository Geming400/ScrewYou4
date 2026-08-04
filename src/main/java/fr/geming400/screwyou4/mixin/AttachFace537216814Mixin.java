package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.AttachFace.class)
public class AttachFace537216814Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/AttachFace;", cancellable = true)
    private static void values__589348657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589348657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/AttachFace;", cancellable = true)
    private static void valueOf_353215346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353215346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__598243657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598243657L))
            info.setReturnValue(null);
    }


}
