package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.BedRule.Rule.class)
public class Rule368004077Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/attribute/BedRule$Rule;", cancellable = true)
    private static void values__30094365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30094365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void test__436670811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436670811L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/attribute/BedRule$Rule;", cancellable = true)
    private static void valueOf__1013831446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013831446L))
            info.setReturnValue(net.minecraft.world.attribute.BedRule.Rule.WHEN_DARK);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_456212699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456212699L))
            info.setReturnValue("d\uA656\uF984");
    }


}
