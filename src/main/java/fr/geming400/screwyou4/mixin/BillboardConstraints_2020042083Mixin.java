package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.BillboardConstraints.class)
public class BillboardConstraints_2020042083Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Display$BillboardConstraints;", cancellable = true)
    private static void values__1946634319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946634319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Display$BillboardConstraints;", cancellable = true)
    private static void valueOf_162522068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162522068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_884581611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884581611L))
            info.setReturnValue(null);
    }


}
