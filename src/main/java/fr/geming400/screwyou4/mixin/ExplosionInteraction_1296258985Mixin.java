package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.Level.ExplosionInteraction.class)
public class ExplosionInteraction_1296258985Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/Level$ExplosionInteraction;", cancellable = true)
    private static void values__343566580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343566580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/Level$ExplosionInteraction;", cancellable = true)
    private static void valueOf__2016176301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2016176301L))
            info.setReturnValue(net.minecraft.world.level.Level.ExplosionInteraction.TNT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1384467606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384467606L))
            info.setReturnValue("\uBE9C:bxUow\u517Bvyr-\uCF4BO.T\uFE9EEJ\uD3271]Ya'\u7D1FS6H*&X!H]\uA2561u\u275Fc5(Q(e5d(\uB92F\u20D0-^2}o\uB168^lP");
    }


}
