package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.Pass.class)
public class Pass437334256Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__471292012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471292012L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1207757781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207757781L))
            info.setReturnValue("He\u150DE+WFa8\u709D-+YqFrq`('\u668F;-iy{`^hi.M!\u9683v\u8ECD\u58F2Q\u319Dr>ExI\"L5r.HSR)5\u48B6\uA506w1 \u266Ewm4)b_h\u849D0\u9DAFL3HCqH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_994686347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994686347L))
            info.setReturnValue(651943589);
    }

    @Inject(at = @At("HEAD"), method = "inputs()Ljava/util/List;", cancellable = true)
    private void inputs__796020087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-796020087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uniforms()Ljava/util/Map;", cancellable = true)
    private void uniforms__1101769671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101769671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outputTarget()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void outputTarget_1513786409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513786409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "referencedTargets()Ljava/util/stream/Stream;", cancellable = true)
    private void referencedTargets_1069211068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069211068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fragmentShaderId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void fragmentShaderId_457864839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457864839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertexShaderId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void vertexShaderId__1686843941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686843941L))
            info.setReturnValue(null);
    }


}
