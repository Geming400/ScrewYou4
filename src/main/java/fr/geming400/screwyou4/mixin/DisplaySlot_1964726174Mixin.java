package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.DisplaySlot.class)
public class DisplaySlot_1964726174Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private static void values_842708919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842708919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private static void valueOf_1852158014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852158014L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.TEAM_LIGHT_PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__730457784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730457784L))
            info.setReturnValue(-535080143);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2052934795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052934795L))
            info.setReturnValue("p\u5019DRJ\u3B27s[*{t-\"l0vW 'Ge>'$Gp$Qb\uB496f\u27A2C7Lx2hiILc\u1D0BC.\u8A79I@RO^q?M7Wv1E;H6Nv30k>");
    }


}
