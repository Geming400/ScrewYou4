package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRuleType.class)
public class GameRuleType_1151905204Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/gamerules/GameRuleType;", cancellable = true)
    private static void values__1324952220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324952220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/gamerules/GameRuleType;", cancellable = true)
    private static void valueOf_849066657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849066657L))
            info.setReturnValue(net.minecraft.world.level.gamerules.GameRuleType.BOOL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_16444732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16444732L))
            info.setReturnValue("n\uA5CEwvvu_sNud8/C\u68F8(");
    }


}
