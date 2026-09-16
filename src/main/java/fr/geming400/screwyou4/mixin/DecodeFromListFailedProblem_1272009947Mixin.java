package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.DecodeFromListFailedProblem.class)
public class DecodeFromListFailedProblem_1272009947Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1966126382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1966126382L))
            info.setReturnValue(992880349);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_2081277102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081277102L))
            info.setReturnValue("/\u18B3f5rf3C|jh\u61BAQw\uD3F8AK\"ThtdM%W/I2WNaD\u54EA\" T.=|H\u88E2\"d9j0\u321E'&jq6hHUB\u2E81sBE\u56EBGV");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_363383678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363383678L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2042433471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042433471L))
            info.setReturnValue("lFU, wJt4gHy@EuT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1829362037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829362037L))
            info.setReturnValue(38712551);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error__1214249347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214249347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void tag__2123672019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123672019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_98022239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98022239L))
            info.setReturnValue("#=V#yuW^ij(\u4811\u25C42[<U5$2la|$|& i\u7F0B$>\u1E23\u899CZ:)gTG\u77FAu\u53B58M");
    }


}
