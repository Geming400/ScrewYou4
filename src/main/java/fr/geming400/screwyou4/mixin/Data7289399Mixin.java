package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShapedRecipePattern.Data.class)
public class Data7289399Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1392801658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392801658L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1128170576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1128170576L))
            info.setReturnValue("gm!퍄Vz茽bU6?*y隅VaLSX1U{v5e璐>3xGin<rY4>6(}PV걅n'l|&V[t\"E)Dd7-%N}N}h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_45552141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45552141L))
            info.setReturnValue(111212749);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Ljava/util/List;", cancellable = true)
    private void pattern_1633626215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633626215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/util/Map;", cancellable = true)
    private void key__1997334241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997334241L))
            info.setReturnValue(null);
    }


}
