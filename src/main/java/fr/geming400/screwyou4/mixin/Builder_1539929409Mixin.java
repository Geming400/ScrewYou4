package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRuleMap.Builder.class)
public class Builder_1539929409Mixin {
        @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)Lnet/minecraft/world/level/gamerules/GameRuleMap$Builder;", cancellable = true)
    private void set_1092934682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1092934682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void build_1477083214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477083214L))
            info.setReturnValue(null);
    }


}
