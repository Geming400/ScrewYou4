package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.AttachFace.class)
public class AttachFace537216814Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/AttachFace;", cancellable = true)
    private static void values__1222898319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222898319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/AttachFace;", cancellable = true)
    private static void valueOf_377585482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377585482L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.AttachFace.FLOOR);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_625425436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625425436L))
            info.setReturnValue("rH)Y");
    }


}
