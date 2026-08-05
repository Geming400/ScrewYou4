package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.PistonType.class)
public class PistonType1872005375Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_736544904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736544904L))
            info.setReturnValue("cM%1D9Tﱏƚ{La.o膱K;Xﲾ',5O/[*d䖑@j+SCW㘋/G3h_E'㬞턊]ꊹS꜇");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/PistonType;", cancellable = true)
    private static void values__825787665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825787665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/PistonType;", cancellable = true)
    private static void valueOf_116776338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(116776338L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.PistonType.STICKY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_736544904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736544904L))
            info.setReturnValue("cM%1D9Tﱏƚ{La.o膱K;Xﲾ',5O/[*d䖑@j+SCW㘋/G3h_E'㬞턊]ꊹS꜇");
    }


}
