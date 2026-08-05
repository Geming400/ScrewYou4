package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.skull.SkullModel.class)
public class SkullModel498824178Mixin {
        @Inject(at = @At("HEAD"), method = "createMobHeadLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createMobHeadLayer_134784955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134784955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHumanoidHeadLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createHumanoidHeadLayer__1544877082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544877082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHeadModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createHeadModel__1937708249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937708249L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1182472723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1182472723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/model/object/skull/SkullModelBase$State;)V", cancellable = true)
    private void setupAnim__1830225904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1830225904L))
            info.cancel();
    }


}
