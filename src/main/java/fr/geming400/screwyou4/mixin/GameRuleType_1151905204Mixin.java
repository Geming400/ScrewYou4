package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRuleType.class)
public class GameRuleType_1151905204Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/gamerules/GameRuleType;", cancellable = true)
    private static void values__1098147326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098147326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/gamerules/GameRuleType;", cancellable = true)
    private static void valueOf_1610274249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610274249L))
            info.setReturnValue(net.minecraft.world.level.gamerules.GameRuleType.INT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1240113825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240113825L))
            info.setReturnValue("\uD52DP\uA86B:BBS\u3D30Pu\u486CG\"P\uFEAD");
    }


}
