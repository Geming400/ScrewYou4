package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerTrigger.TriggerInstance.class)
public class TriggerInstance_1062307286Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1847147752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847147752L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__73152690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73152690L))
            info.setReturnValue("B*+)Jv컲W.&jJmqw-o6T%vk+oTgJeꈭ1☢48m(i]%칾jw%j]Qએ㋀䟧w|jShTWV2\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1100570027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100570027L))
            info.setReturnValue(-737492252);
    }

    @Inject(at = @At("HEAD"), method = "tick()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tick__1958908612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958908612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1307768707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307768707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "located(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void located__640677151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640677151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "located(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void located__196563413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196563413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "located(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void located__726401851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726401851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "avoidVibration()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void avoidVibration__1958908612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958908612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "walkOnBlockWithEquipment(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/item/Item;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void walkOnBlockWithEquipment_495879949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(495879949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sleptInBed()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void sleptInBed__1958908612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958908612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "raidWon()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void raidWon__1958908612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958908612L))
            info.setReturnValue(null);
    }


}
