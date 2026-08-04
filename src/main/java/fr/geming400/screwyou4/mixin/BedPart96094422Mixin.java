package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BedPart.class)
public class BedPart96094422Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1039366049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039366049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BedPart;", cancellable = true)
    private static void values_28627009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28627009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BedPart;", cancellable = true)
    private static void valueOf_987965566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987965566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__1039366049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039366049L))
            info.setReturnValue(null);
    }


}
