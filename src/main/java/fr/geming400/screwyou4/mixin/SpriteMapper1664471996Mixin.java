package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SpriteMapper.class)
public class SpriteMapper1664471996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1244983041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244983041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_529012021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529012021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1702734738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702734738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private void apply_646803448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646803448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prefix()Ljava/lang/String;", cancellable = true)
    private void prefix_529011525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529011525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultNamespaceApply(Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private void defaultNamespaceApply_1126309302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126309302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sheet()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sheet__778594557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778594557L))
            info.setReturnValue(null);
    }


}
