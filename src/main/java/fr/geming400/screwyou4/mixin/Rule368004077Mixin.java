package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.BedRule.Rule.class)
public class Rule368004077Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/attribute/BedRule$Rule;", cancellable = true)
    private static void values_1326495941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326495941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void test__636967021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636967021L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/attribute/BedRule$Rule;", cancellable = true)
    private static void valueOf__963276862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963276862L))
            info.setReturnValue(net.minecraft.world.attribute.BedRule.Rule.WHEN_DARK);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__767456394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-767456394L))
            info.setReturnValue("ci\u91C3La-V\u8CC6rH]=D4y\uD4F2\u34F5}\u5E3E\uA934:o2{)p&s");
    }


}
