package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.skull.SkullModel.class)
public class SkullModel498824178Mixin {
        @Inject(at = @At("HEAD"), method = "createMobHeadLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createMobHeadLayer__215307986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-215307986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHumanoidHeadLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createHumanoidHeadLayer__215307986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-215307986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHeadModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createHeadModel_2115523476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115523476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1884461057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1884461057L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/model/object/skull/SkullModelBase$State;)V", cancellable = true)
    private void setupAnim__693253890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-693253890L))
            info.cancel();
    }


}
