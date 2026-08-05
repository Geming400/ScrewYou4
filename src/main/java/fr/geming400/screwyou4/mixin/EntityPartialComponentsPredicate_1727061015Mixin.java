package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityPartialComponentsPredicate.class)
public class EntityPartialComponentsPredicate_1727061015Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_818434746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(818434746L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1797482757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797482757L))
            info.setReturnValue("f\u08F5\u1F5D\u4157\u8A16RmM1&4ZP`p$|ji!Oy4P\u941C[;IL_:vPr\u1348*c5F(sk EoOb\u07A0i@RD/b");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2010554191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2010554191L))
            info.setReturnValue(-291926952);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1217597348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217597348L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicates()Ljava/util/Map;", cancellable = true)
    private void predicates_1496821730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496821730L))
            info.setReturnValue(null);
    }


}
