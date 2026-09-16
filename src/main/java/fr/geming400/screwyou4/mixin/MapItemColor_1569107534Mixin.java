package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.MapItemColor.class)
public class MapItemColor_1569107534Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_660481265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660481265L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1955436238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955436238L))
            info.setReturnValue("hM\uC0B1^+C:|J.pl3mjM\u0844VO9J\u5BE2I:v^^_s5E4V(tX[TEK9D<`cW,\u01E5>hvCt(\uD375\uD183eOD:4Zv@=S\u3255\u9394&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2126459624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126459624L))
            info.setReturnValue(-498007480);
    }

    @Inject(at = @At("HEAD"), method = "rgb()I", cancellable = true)
    private void rgb__1846459514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846459514L))
            info.setReturnValue(-282444192);
    }


}
