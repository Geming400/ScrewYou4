package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.CommandSourceStack.class)
public class CommandSourceStack_1707859876Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions__404593563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404593563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1406695251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406695251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "callback()Lnet/minecraft/commands/CommandResultCallback;", cancellable = true)
    private void callback__1852433028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852433028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__845217802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845217802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_1586755265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1586755265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosition__743353699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743353699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAnchor()Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private void getAnchor__932088700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932088700L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.FEET);
    }

    @Inject(at = @At("HEAD"), method = "facing(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void facing_2136491388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136491388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "facing(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void facing__1132209096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132209096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendSystemMessage__1674645190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1674645190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withRotation(Lnet/minecraft/world/phys/Vec2;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withRotation__1224745117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1224745117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPosition(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withPosition_1499949997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499949997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_652966665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652966665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendChatMessage(Lnet/minecraft/network/chat/OutgoingChatMessage;ZLnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendChatMessage_830649180(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830649180L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldFilterMessageTo(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void shouldFilterMessageTo_1031491457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031491457L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withCallback(Lnet/minecraft/commands/CommandResultCallback;)Lnet/minecraft/commands/ExecutionCommandSource;", cancellable = true)
    private void withCallback_1235807856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235807856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCallback(Lnet/minecraft/commands/CommandResultCallback;Ljava/util/function/BinaryOperator;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withCallback__1022191165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022191165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCallback(Lnet/minecraft/commands/CommandResultCallback;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withCallback_956191580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956191580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_1709489810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709489810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__1249909200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249909200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSilent()Z", cancellable = true)
    private void isSilent_846817947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846817947L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayer_1293894569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293894569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPlayer()Z", cancellable = true)
    private void isPlayer_801938319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801938319L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withPermission(Lnet/minecraft/server/permissions/PermissionSet;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withPermission_1494593916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494593916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleError(Lcom/mojang/brigadier/exceptions/CommandExceptionType;Lcom/mojang/brigadier/Message;ZLnet/minecraft/commands/execution/TraceCallbacks;)V", cancellable = true)
    private void handleError_927562448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(927562448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dispatcher()Lcom/mojang/brigadier/CommandDispatcher;", cancellable = true)
    private void dispatcher__648920129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648920129L))
            info.setReturnValue(new com.mojang.brigadier.CommandDispatcher());
    }

    @Inject(at = @At("HEAD"), method = "withLevel(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withLevel__903696571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903696571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void getRotation_1910792137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910792137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__460005161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460005161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSource(Lnet/minecraft/commands/CommandSource;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withSource_409422605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409422605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOnlinePlayerNames()Ljava/util/Collection;", cancellable = true)
    private void getOnlinePlayerNames__50406799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-50406799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChatMessageChainer()Lnet/minecraft/util/TaskChainer;", cancellable = true)
    private void getChatMessageChainer_1003760790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003760790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSigningContext()Lnet/minecraft/commands/CommandSigningContext;", cancellable = true)
    private void getSigningContext__889908241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889908241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllTeams()Ljava/util/Collection;", cancellable = true)
    private void getAllTeams_2046869086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046869086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customSuggestion(Lcom/mojang/brigadier/context/CommandContext;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void customSuggestion__934137199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934137199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEntity(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withEntity_498172788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498172788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSuppressedOutput()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withSuppressedOutput__505803689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505803689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendSuccess(Ljava/util/function/Supplier;Z)V", cancellable = true)
    private void sendSuccess__1689092591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1689092591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withSigningContext(Lnet/minecraft/commands/CommandSigningContext;Lnet/minecraft/util/TaskChainer;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withSigningContext_1111310862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111310862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withMaximumPermission(Lnet/minecraft/server/permissions/PermissionSet;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withMaximumPermission_1171663432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171663432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendFailure(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendFailure_772883784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(772883784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextName()Ljava/lang/String;", cancellable = true)
    private void getTextName__1861024902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861024902L))
            info.setReturnValue("WsPulvgORd0\u2764qTNHcDBD_\"M$C('aw'\u2FB9&'V0G");
    }

    @Inject(at = @At("HEAD"), method = "getPlayerOrException()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayerOrException_1788139243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1788139243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityOrException()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntityOrException_250764982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250764982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withAnchor(Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withAnchor__873291890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873291890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSounds()Ljava/util/stream/Stream;", cancellable = true)
    private void getAvailableSounds_752703553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752703553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "suggestRegistryElements(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/commands/SharedSuggestionProvider$ElementSuggestionType;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;Lcom/mojang/brigadier/context/CommandContext;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void suggestRegistryElements_2036122095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036122095L))
            info.setReturnValue(null);
    }


}
