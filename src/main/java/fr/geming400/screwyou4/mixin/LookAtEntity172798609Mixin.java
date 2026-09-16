package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.LookAt.LookAtEntity.class)
public class LookAtEntity172798609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__735827659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735827659L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_943222134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943222134L))
            info.setReturnValue("[*Y\u3DEF3%\uD6A2CWbGU)Uw\u3A1CAdw\u7AD4x;O}35j\u300FssEBl(B)JcW&1'>Y^Z_e\u487Dh*=v&\u34FDu|I'bh/\u5211nD/\uA51C\u7A85>\u3CB3<\u31E5!z\u9391EkQG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_730150700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730150700L))
            info.setReturnValue(-2125826254);
    }

    @Inject(at = @At("HEAD"), method = "anchor()Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private void anchor_1262402044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262402044L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.FEET);
    }

    @Inject(at = @At("HEAD"), method = "perform(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void perform_1081460890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1081460890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void entity_171222228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171222228L))
            info.setReturnValue(null);
    }


}
