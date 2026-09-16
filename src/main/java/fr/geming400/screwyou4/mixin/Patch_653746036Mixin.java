package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerSkin.Patch.class)
public class Patch_653746036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__254880233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254880233L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1424169560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424169560L))
            info.setReturnValue("c`Rgzj\u1E22\uAD90Sj\u40E3qGGig<}*rQq\u3441)!kqFG\u7BCAE\u2255Z\u9F52b;0/]\u6250c#iKM'6uIP#<(I\uC392K(JL\u95A1/um%^QZTSA&A\u9086Z\uAA40&h\u032E03\u7C74\u9CBF*]9qplt*F}+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1211098126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211098126L))
            info.setReturnValue(1186821264);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/world/entity/player/PlayerSkin$Patch;", cancellable = true)
    private static void create__237483996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-237483996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Ljava/util/Optional;", cancellable = true)
    private void model_436740426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436740426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "body()Ljava/util/Optional;", cancellable = true)
    private void body_1937556675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937556675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cape()Ljava/util/Optional;", cancellable = true)
    private void cape_71877364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71877364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elytra()Ljava/util/Optional;", cancellable = true)
    private void elytra__1677119022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677119022L))
            info.setReturnValue(null);
    }


}
