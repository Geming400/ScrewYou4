package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.class)
public class RenderType10652422Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private static void values__703590188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703590188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private static void valueOf__1816863077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816863077L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.HEARTS);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId_1157944032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157944032L))
            info.setReturnValue("6*p\u47ACBsk]>\u9D81D}\u793E?#3*6iap8wR<.UX\u075A@&)g G.O2l8-Q-saO4g'XP\u4B92y<Xx\u65AFZ.\uADF17U\uAF10m'fxjJXijuPrW!@\u7058j");
    }

    @Inject(at = @At("HEAD"), method = "byId(Ljava/lang/String;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private static void byId__789182139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789182139L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.HEARTS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_98861044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98861044L))
            info.setReturnValue("+\u57678VX\uCAEDO|>!`Q877ZxH)Ai,bK\u0CA0}PrD\"\uD23B!\uD4BE5%`W\uFE68nu\u358AJjlqV_+\u74C1o6eT7Z@c_D.\u35F9");
    }


}
